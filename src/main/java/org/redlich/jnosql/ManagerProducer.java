/*
 * Copyright (c) 2020 Otávio Santana and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *
 * Otavio Santana
 */

package org.redlich.jnosql;

import jakarta.nosql.document.DocumentCollectionManager;
import jakarta.nosql.mapping.Database;
import jakarta.nosql.mapping.DatabaseType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/*
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
 */

@ApplicationScoped
public class ManagerProducer {

    @Inject
    @ConfigProperty(name = "db1")
    private DocumentCollectionManager publicationsDoc;

    @Inject
    @ConfigProperty(name = "db2")
    private DocumentCollectionManager romain;

    @ApplicationScoped
    @Produces
    @Database(provider = "publicationsService", value = DatabaseType.DOCUMENT)
    public DocumentCollectionManager getPublications() {
        return publicationsDoc;
        }

    @ApplicationScoped
    @Produces
    @Database(provider = "publicationsService", value = DatabaseType.DOCUMENT)
    public DocumentCollectionManager getAuthors() {
        return publicationsDoc;
        }

    @ApplicationScoped
    @Produces
    @Database(provider = "romansService", value = DatabaseType.DOCUMENT)
    public DocumentCollectionManager getRomain() {
        return romain;
        }

    public void close(@Disposes @Any DocumentCollectionManager manager) {
        manager.close();
        }
    }
