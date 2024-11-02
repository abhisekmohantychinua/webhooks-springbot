package dev.abhisek.webhooks_springboot.services;

import dev.abhisek.webhooks_springboot.entities.SchoolData;

public interface SchoolDataService {

    SchoolData createNewSchool(String schoolName);

}
