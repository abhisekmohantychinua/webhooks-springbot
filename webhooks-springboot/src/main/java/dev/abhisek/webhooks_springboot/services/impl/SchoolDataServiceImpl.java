package dev.abhisek.webhooks_springboot.services.impl;

import org.springframework.stereotype.Service;

import dev.abhisek.webhooks_springboot.entities.SchoolData;
import dev.abhisek.webhooks_springboot.repo.SchoolDataRepository;
import dev.abhisek.webhooks_springboot.services.SchoolDataService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolDataServiceImpl implements SchoolDataService {

    private final SchoolDataRepository repository;

    @Override
    public SchoolData createNewSchool(String schoolName) {
        SchoolData school = new SchoolData();
        school.setSchoolName(schoolName);
        return repository.save(school);
    }

}
