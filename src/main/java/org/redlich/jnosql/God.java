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

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

@Entity
public class God {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private List<String> powers;

    God(String name, List<String> powers) {
        this.name = name;
        this.powers = powers;
        }

    public God() {
        }

    public String getId() {
        return id;
        }

    public String getTitle() {
        return name;
        }

    @Override
    public String toString() {
        return "God { " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                " }\n";
        }
    }
