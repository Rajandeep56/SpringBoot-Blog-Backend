package com.visone.blog.payloads;




import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	private int id;
	
	//@NotBlank(message = "Email is mandatory")
	@NotEmpty
	private String name;
	
	@Email(message = "email address is not valid !!")
	private String email;


	//@NotNull
	@NotEmpty
	@Size(min=3,max=10,message="password must be min of 3 chars and maximum of 10 chars")
	private String password;

	private String about;
}
