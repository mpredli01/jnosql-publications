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

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
/*
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
 */

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ServiceApp {

    private static final Logger LOGGER = Logger.getLogger(ServiceApp.class.getName());

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            PublicationService publicationService = container.select(PublicationService.class).get();
            AuthorService authorService = container.select(AuthorService.class).get();
            RomanService romanService = container.select(RomanService.class).get();

            /*
            Publications publication = new Publications("What's New in MicroProfile 1.2", "2021/04/30", "https://infoq.com");
            publicationService.insert(publication);
            God remus = new God("Remus", Arrays.asList("Jupiter", "Water"));
            romanService.insert(remus);
             */

            System.out.println(publicationService.findByTitle("Stagnation with Java EE 8: Can the Java Community Make a Difference?").collect(Collectors.toList()));
            System.out.println(publicationService.findByAuthorId(1).collect(Collectors.toList()));

            System.out.println(authorService.findBylastName("Redlich").collect(Collectors.toList()));

            System.out.println(romanService.findName("Remus").collect(Collectors.toList()));
            }
        }

    private ServiceApp() {
        }
    }
