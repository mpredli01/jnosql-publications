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

import java.util.List;
import java.util.stream.Stream;

import jakarta.nosql.mapping.Repository;

import javax.enterprise.context.ApplicationScoped;
// import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public interface PublicationRepository extends Repository<Publications, String> {

    List<Publications> findByTitle(String publication);

    List<Publications> findByAuthorId (int author_id);
    }
