package com.nastypad.drunkies.shared.mapping;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;


public class EnhancedModelMapper extends ModelMapper {

    public EnhancedModelMapper() {
        super();
    }

    //Transform a list of object types to a list of other object types.
    public <S, T> List<T> mapList(List<S> sourceList, Class<T> targetClass) {
        return sourceList.stream().map(item -> this.map(item, targetClass)).collect(Collectors.toList());
    }

}
