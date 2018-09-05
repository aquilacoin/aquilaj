package org.conciergej.kits;

import org.conciergej.core.NetworkParameters;
import org.conciergej.store.BlockStore;
import org.conciergej.store.BlockStoreException;
import org.conciergej.store.LevelDBBlockStore;
import org.conciergej.store.SPVBlockStore;

import java.io.File;

/**
 * Created by Eric on 2/23/2016.
 */
public class LevelDBWalletAppKit extends WalletAppKit {
    public LevelDBWalletAppKit(NetworkParameters params, File directory, String filePrefix) {
        super(params, directory, filePrefix);
    }

    /**
     * Override this to use a {@link BlockStore} that isn't the default of {@link SPVBlockStore}.
     */
    protected BlockStore provideBlockStore(File file) throws BlockStoreException {
        return new LevelDBBlockStore(context, file);
    }
}
