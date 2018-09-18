package org.state.patch.sql.config;

public class ServiceConfig {

    public String                 name       = "state-patch-sql";
    public final ModelConfig      model      = new ModelConfig();
    public final EntityConfig     entity     = new EntityConfig();
    public final PatchTopicConfig patchtopic = new PatchTopicConfig();
}
