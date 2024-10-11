package com.managment.employment.service;

import com.managment.employment.model.Address;
import com.managment.employment.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    // Add a new address
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    // Get all addresses
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    // Get an address by its ID
    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    // Delete an address by its ID
    public boolean deleteAddress(Long id) {
        if (addressRepository.existsById(id)) {
            addressRepository.deleteById(id);
            return true;
        }
        return false;
    }
}


