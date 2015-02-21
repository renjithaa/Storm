/*
 * Copyright 2015 Dimitry Ivanov (mail@dimitryivanov.ru)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.noties.storm;

/**
 * Created by Dimitry Ivanov (mail@dimitryivanov.ru) 01.02.15.
 */
public enum FieldType {

    STRING      ("TEXT"),
    LONG        ("INTEGER"),
    INT         ("INTEGER"),
    BOOLEAN     ("INTEGER"),
    FLOAT       ("REAL"),
    DOUBLE      ("REAL"),
//    BYTE        ("INTEGER"),
    BYTE_ARRAY  ("BLOB"),
    SHORT       ("INTEGER"),
    UNKNOWN     (null);

    private final String mSqlRepresentation;

    private FieldType(String rep) {
        this.mSqlRepresentation = rep;
    }

    public String getSqlRepresentation() {
        return mSqlRepresentation;
    }
}
