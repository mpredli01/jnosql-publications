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
public class Publications {

    @Id
    private String id;

    @Column
    private String title;

    @Column
    private int author_id;

    @Column
    private String publish_date;

    @Column
    private String url;

    public Publications() {
        }

    Publications(String title, int author_id, String publish_date, String url) {
        this.title = title;
        this.author_id = author_id;
        this.publish_date = publish_date;
        this.url = url;
        }

    public String getId() {
        return id;
        }

    public String getTitle() {
        return title;
        }

    public int getAuthorId() {
        return author_id;
        }

    public String getPublishDate() {
        return publish_date;
        }

    public String getUrl() {
        return url;
        }

    @Override
    public String toString() {
        return "Publication { " +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", authorId='" + author_id + '\'' +
                ", publish_date='" + publish_date + '\'' +
                ", url='" + url + '\'' +
                " }\n";
        }
    }
