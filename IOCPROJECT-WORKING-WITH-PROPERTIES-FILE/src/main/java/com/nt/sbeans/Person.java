package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("person")
@PropertySource("com/nt/common/info.properties")
public class Person {
	@Value("${p.id}")
  private Integer pid;
	@Value("${p.name}")
  private String name;
	@Value("${p.city}")
  private String adress;
	@Value("9348468872")
  private Long mobileNo;
	@Value("${os.version}")
  private String os_ver;
	@Value("${os.name}")
  private String os_name;
	@Value("${Path}")
  private String path;

@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", adress=" + adress + ", mobileNo=" + mobileNo + ", os_ver="
			+ os_ver + ", os_name=" + os_name + ", path=" + path + "]";
}
  
  
}
