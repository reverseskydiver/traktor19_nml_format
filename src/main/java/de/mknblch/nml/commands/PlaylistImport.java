package de.mknblch.nml.commands;

import de.mknblch.nml.common.NMLHelper;
import de.mknblch.nml.common.TypeHelper;
import de.mknblch.nml.entities.PLAYLIST;
import de.mknblch.params.annotations.Argument;
import de.mknblch.params.annotations.Command;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by mknblch on 13.09.2015.
 */
@Command(trigger = "playlist", sub = "import", description = "Import all tracks into existing playlist or create new one by directory name")
public class PlaylistImport extends WithCollection implements Runnable {

    @Argument(trigger = "-d", description = "Path to directory")
    private Path directory;

    @Override
    public void run() {

        try {
            importDirectory();
        } catch (IOException | JAXBException e) {
            e.printStackTrace(); // TODO
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    private void importDirectory() throws IOException, JAXBException {
        final Path name = directory.toAbsolutePath().getFileName();

        if (null == name) {
            throw new IllegalArgumentException("Invalid Path");
        }

        System.out.printf("import %s -> %s%n", directory.toAbsolutePath().toString(), name.toString());
        final PLAYLIST playlist = getEditor().createPlaylist(name.toString());
        Files.walk(directory)
                .filter(Files::isRegularFile)
                .filter(TypeHelper.INSTANCE::isSupported)
                .map(Path::toAbsolutePath)
                .map(getEditor()::addCollectionEntry)
                .peek(e -> System.out.println(NMLHelper.entryToPath(e).toString()))
                .map(NMLHelper::collectionEntryToPlaylistEntry)
                .forEach(e -> NMLHelper.addEntryToPlaylist(playlist, e));
        getEditor().save();
    }
}
