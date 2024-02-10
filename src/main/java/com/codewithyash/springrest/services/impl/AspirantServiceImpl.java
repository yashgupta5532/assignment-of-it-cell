package com.codewithyash.springrest.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithyash.springrest.entities.Aspirant;
import com.codewithyash.springrest.exception.ResourceNotFoundException;
import com.codewithyash.springrest.payload.AspirantDto;
import com.codewithyash.springrest.repositories.AspirantRepo;
import com.codewithyash.springrest.services.AspirantService;

@Service
public class AspirantServiceImpl implements AspirantService{

    @Autowired
    private AspirantRepo aspirantRepo;

    @Override
    public AspirantDto createAspirant(AspirantDto aspirantDto) {
        Aspirant aspirant=this.aspirantDtoToAspirant(aspirantDto);
        Aspirant savedAspirant=this.aspirantRepo.save(aspirant);
        return this.aspirantToAspirantDto(savedAspirant);
    }

    @Override
    public AspirantDto updateAspirant(AspirantDto aspirantDto, Integer aspirantId) {
        Aspirant aspirant=this.aspirantRepo.findById(aspirantId).orElseThrow(()->new ResourceNotFoundException("Aspirant","Id",aspirantId));
        // aspirant.setId(aspirantDto.getId());
        // aspirant.setFormNo(aspirantDto.getFormNo());
        // aspirant.setAddmissionNo(aspirantDto.getAddmissionNo());
        // aspirant.setTemp_admissionNo(aspirantDto.getTemp_admissionNo());
        
        if (aspirantDto.getTitle() != null) {
            aspirant.setTitle(aspirantDto.getTitle());
        }
        
        if (aspirantDto.getName() != null) {
            aspirant.setName(aspirantDto.getName());
        }
        if (aspirantDto.getBirthDay() != null) {
            aspirant.setBirthDay(aspirantDto.getBirthDay());
        }
        if (aspirantDto.getSex() != null) {
            aspirant.setSex(aspirantDto.getSex());
        }
        if (aspirantDto.getReligion() != null) {
            aspirant.setReligion(aspirantDto.getReligion());
        }
        if (aspirantDto.getMartial_status() != null) {
            aspirant.setMartial_status(aspirantDto.getMartial_status());
        }
        if ((aspirantDto.getPhone() )!= 0) {
            aspirant.setPhone(aspirantDto.getPhone());
        }
        if (aspirantDto.getEmail() != null) {
            aspirant.setEmail(aspirantDto.getEmail());
        }
        if (aspirantDto.getNationality() != null) {
            aspirant.setNationality(aspirantDto.getNationality());
        }
        if (aspirantDto.getPassword() != null) {
            aspirant.setPassword(aspirantDto.getPassword());
        }
        if (aspirantDto.getBlood_group() != null) {
            aspirant.setBlood_group(aspirantDto.getBlood_group());
        }
        if (aspirantDto.getPhysical_challenge() != null) {
            aspirant.setPhysical_challenge(aspirantDto.getPhysical_challenge());
        }
        aspirant.setAdhar_card_no(aspirantDto.getAdhar_card_no());
        // aspirant.setDate_of_admission(aspirantDto.getDate_of_admission());
        // aspirant.setAdmission_year(aspirantDto.getAdmission_year());

        Aspirant updatedAspirant=this.aspirantRepo.save(aspirant);
        return this.aspirantToAspirantDto(updatedAspirant);
    }

    @Override
    public AspirantDto getAspirantById(Integer aspirantId) {
        Aspirant aspirant=this.aspirantRepo.findById(aspirantId).orElseThrow(()->new ResourceNotFoundException("Aspirant "," Id ",aspirantId));

        return this.aspirantToAspirantDto(aspirant);
    }

    @Override
    public List<AspirantDto> getAllAspirants() {
        List<Aspirant> allAspirants=this.aspirantRepo.findAll();
        List<AspirantDto> aspirantDtos=allAspirants.stream().map(aspirant->this.aspirantToAspirantDto(aspirant)).collect(Collectors.toList());
        return aspirantDtos;
    }

    @Override
    public void deleteAspirant(Integer aspirantId) {
        Aspirant aspirant = this.aspirantRepo.findById(aspirantId)
                .orElseThrow(() -> new ResourceNotFoundException("Aspirant", "Id", aspirantId));
        this.aspirantRepo.delete(aspirant);
    }
    
    


    private Aspirant aspirantDtoToAspirant(AspirantDto aspirantDto){
        Aspirant aspirant=new Aspirant();
        aspirant.setId(aspirantDto.getId());
        aspirant.setFormNo(aspirantDto.getFormNo());
        aspirant.setAddmissionNo(aspirantDto.getAddmissionNo());
        aspirant.setTemp_admissionNo(aspirantDto.getTemp_admissionNo());
        aspirant.setTitle(aspirantDto.getTitle());
        aspirant.setName(aspirantDto.getName());
        aspirant.setBirthDay(aspirantDto.getBirthDay());
        aspirant.setSex(aspirantDto.getSex());
        aspirant.setReligion(aspirantDto.getReligion());
        aspirant.setMartial_status(aspirantDto.getMartial_status());
        aspirant.setEmail(aspirantDto.getEmail());
        aspirant.setPhone(aspirantDto.getPhone());
        aspirant.setNationality(aspirantDto.getNationality());
        aspirant.setPassword(aspirantDto.getPassword());
        aspirant.setAdhar_card_no(aspirantDto.getAdhar_card_no());
        aspirant.setDate_of_admission(aspirantDto.getDate_of_admission());
        aspirant.setAdmission_year(aspirantDto.getAdmission_year());
        aspirant.setBlood_group(aspirantDto.getBlood_group());
        aspirant.setPhysical_challenge(aspirantDto.getPhysical_challenge());

        return aspirant;
    }


    private AspirantDto aspirantToAspirantDto(Aspirant aspirant){
        AspirantDto aspirantDto=new AspirantDto();
        aspirantDto.setId(aspirant.getId());
        aspirantDto.setFormNo(aspirant.getFormNo());
        aspirantDto.setAddmissionNo(aspirant.getAddmissionNo());
        aspirantDto.setTemp_admissionNo(aspirant.getTemp_admissionNo());
        aspirantDto.setTitle(aspirant.getTitle());
        aspirantDto.setName(aspirant.getName());
        aspirantDto.setBirthDay(aspirant.getBirthDay());
        aspirantDto.setSex(aspirant.getSex());
        aspirantDto.setReligion(aspirant.getReligion());
        aspirantDto.setMartial_status(aspirant.getMartial_status());
        aspirantDto.setEmail(aspirant.getEmail());
        aspirantDto.setPhone(aspirant.getPhone());
        aspirantDto.setNationality(aspirant.getNationality());
        aspirantDto.setPassword(aspirant.getPassword());
        aspirantDto.setAdhar_card_no(aspirant.getAdhar_card_no());
        aspirantDto.setDate_of_admission(aspirant.getDate_of_admission());
        aspirantDto.setAdmission_year(aspirant.getAdmission_year());
        aspirantDto.setBlood_group(aspirant.getBlood_group());
        aspirantDto.setPhysical_challenge(aspirant.getPhysical_challenge());

        return aspirantDto;
    }


}
