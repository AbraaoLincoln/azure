package com.test.cosmoDB.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Data;

@Container(containerName = "user", ru = "4000")
@Data
public class User {
    @PartitionKey
    private String id;
    private String name;
    private String email;
}
