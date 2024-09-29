package com.dang.travel.member.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupReq {

	@NotBlank
	@Size(min = 3, max = 50)
	private String nickname;

	@NotBlank
	@Email
	private String email;

	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

	@NotBlank
	@Size(min = 10, max = 11)
	private String phone;

}
