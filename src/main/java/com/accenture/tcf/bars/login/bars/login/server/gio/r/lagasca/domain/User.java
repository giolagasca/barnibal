package com.accenture.tcf.bars.login.bars.login.server.gio.r.lagasca.domain;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;	

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	@NonNull
	public Long id;
	@NonNull
	private String username;
	@NonNull
    private String password;
	@NonNull
    private String  role;
    private int port;
    

}
