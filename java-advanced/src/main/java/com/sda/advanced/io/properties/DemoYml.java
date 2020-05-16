package com.sda.advanced.io.properties;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;
import java.io.IOException;

public class DemoYml {

    public static void main(String[] args) throws IOException {
        String sourcePath = "/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/user.yml";
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        User user = mapper.readValue(new File(sourcePath), User.class);

        System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.JSON_STYLE));
    }
}
