/*
 * Copyright (c) 2017 Otávio Santana and others
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

import java.util.Arrays;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
/*
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
 */

import java.util.logging.Logger;

public class RepositoryApp {

    private static final Logger LOGGER = Logger.getLogger(RepositoryApp.class.getName());

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Service service = container.select(Service.class).get();

            PublicationRepository publicationRepository = service.getPublicationRepository();
            AuthorRepository authorRepository = service.getAuthorRepository();
            RomanRepository romanRepository = service.getRomanRepository();

            // Publications publication = new Publications("Introducing Gradle Build Scans", "2021/04/30" ,"https://infoq.com");
            // publicationRepository.save(publication);
            God remus = new God("Remus", Arrays.asList("Jupiter", "Water"));
            romanRepository.save(remus);

            System.out.println(publicationRepository.findByTitle("What's New in MicroProfile 1.2"));
            System.out.println(publicationRepository.findByAuthorId(1));
            System.out.println(authorRepository.findByLastName("Redlich"));
            System.out.println(romanRepository.findByName("Diana"));

            // LOGGER.info("Finding in the Publication repository...\n");
            // LOGGER.info("Finding by title, What's New in MicroProfile 1.2:\n" + publicationRepository.findByTitle("What's New in MicroProfile 1.2"));
            // LOGGER.info("Finding by name, Diana:\n" + romanRepository.findByName("Diana"));

            // LOGGER.info("Finding in the Roman service ");
            // LOGGER.info("Finding by Artemis : " + romansRepository.findByName("Artemis"));
            // LOGGER.info("Finding by Diana " + romansRepository.findByName("Diana"));
            }
        }

    private RepositoryApp() {
        }
    }
