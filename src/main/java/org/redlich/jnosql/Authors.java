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
public class Authors {

    @Id
    private String id;

    @Column
    private String last_name;

    @Column
    private String first_name;

    @Column
    private String home_email;

    public Authors() {
        }

    Authors(String last_name, int author_id, String first_name, String home_email) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.home_email = home_email;
        }

    public String getId() {
        return id;
        }

    public String getLastName() {
        return last_name;
        }

    public String getFirstName() {
        return first_name;
        }

    public String getEmail() {
        return home_email;
        }

    @Override
    public String toString() {
        return "Author { " +
                "id='" + id + '\'' +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", home_email='" + home_email + '\'' +
                " }\n";
        }
    }
