package com.codewithyash.springrest.services;

import java.util.List;
import com.codewithyash.springrest.payload.AspirantDto;

public interface AspirantService {
    
    AspirantDto createAspirant(AspirantDto aspirantDto);

    AspirantDto updateAspirant(AspirantDto aspirantdDto,Integer aspirantId);

    AspirantDto getAspirantById(Integer aspirantId);

    List<AspirantDto> getAllAspirants();

    void deleteAspirant(Integer aspirantId);
}
