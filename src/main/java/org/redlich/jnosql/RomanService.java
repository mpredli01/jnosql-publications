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

import jakarta.nosql.document.DocumentQuery;
import jakarta.nosql.mapping.document.DocumentTemplate;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
/*
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
 */

import java.util.stream.Stream;

import static jakarta.nosql.document.DocumentQuery.select;

@ApplicationScoped
public class RomanService {

    @Inject
    @ConfigProperty(name = "db2")
    private DocumentTemplate template;

    public God insert(God god) {
        return template.insert(god);
        }

    public Stream<God> findName(String name) {
        DocumentQuery query = select().from("God")
                .where("name")
                .eq(name).build();

        return template.select(query);
        }
    }
