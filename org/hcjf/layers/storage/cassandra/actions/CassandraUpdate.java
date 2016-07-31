package org.hcjf.layers.storage.cassandra.actions;

import org.hcjf.layers.storage.StorageAccessException;
import org.hcjf.layers.storage.actions.ResultSet;
import org.hcjf.layers.storage.actions.Update;
import org.hcjf.layers.storage.cassandra.CassandraStorageSession;

/**
 * @author javaito
 * @mail javaito@gmail.com
 */
public class CassandraUpdate extends Update<CassandraStorageSession> {

    public CassandraUpdate(CassandraStorageSession session) {
        super(session);
    }

    /**
     * @return
     */
    @Override
    public <R extends ResultSet> R execute() throws StorageAccessException {
        return null;
    }
}
