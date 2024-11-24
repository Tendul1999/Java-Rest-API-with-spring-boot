package com.CrudSpringbootAPI;
import org.springframework.web.bind.annotation.*;

import com.CrudSpringbootAPI.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return cloudVendor;
				
				//new CloudVendor ("C1", "Vendor 1", "Address One", "xxxx");
	}

	@PostMapping
	
	public String createCloudVendorDetails( @RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "CloudVendor Created Successfully";
	}
	
	
	@PutMapping
	
	public String updateCloudVendorDetails( @RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "CloudVendor Updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	
	public String deleteCloudVendorDetails( String vendorId) {
		this.cloudVendor = null;
		return "CloudVendor deleted Successfully";
	}
	
}
