/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.jdbc.jooq;

import lombok.Data;

import org.springframework.data.annotation.Id;

/**
 * Coarse classification for LegoSets, like "Car", "Plane", "Building" and so on.
 *
 * @author Jens Schauder
 * @author Florian Lüdiger
 */
@Data
public class Category {

	private final @Id Long id;
	private String name, description;
	private AgeGroup ageGroup;

	public Category(Long id, String name, String description, AgeGroup ageGroup) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.ageGroup = ageGroup;
	}
}
