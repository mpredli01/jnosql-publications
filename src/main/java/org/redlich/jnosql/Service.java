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

import jakarta.nosql.mapping.Database;
import jakarta.nosql.mapping.DatabaseType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
/*
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
 */

@ApplicationScoped
public class Service {

    @Inject
    @Database(provider = "publicationsService", value = DatabaseType.DOCUMENT)
    private PublicationRepository publicationRepository;

    @Inject
    @Database(provider = "publicationsService", value = DatabaseType.DOCUMENT)
    private AuthorRepository authorRepository;

    @Inject
    @Database(provider = "romansService", value = DatabaseType.DOCUMENT)
    private RomanRepository romanRepository;

    public PublicationRepository getPublicationRepository() {
        return publicationRepository;
        }

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
        }

    public RomanRepository getRomanRepository() {
        return romanRepository;
        }
    }
