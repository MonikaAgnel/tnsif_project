package com.tnsif.userservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
        @Id
		@Column(name="id")
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="age")
		private int age;
		@Column(name="dob")
		private int  dob;
		@Column(name="gender")
		private String gender;
		@Column(name="Education")
		private String Education;
		@Column(name="city")
		private String city;

		public User(int id, String name, int age, int dob, String gender, String education, String city) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.dob = dob;
			this.gender = gender;
			this.Education = education;
			this.city = city;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getDob() {
			return dob;
		}

		public void setDob(int dob) {
			this.dob = dob;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEducation() {
			return Education;
		}

		public void setEducation(String education) {
			Education = education;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		public User() {
			super();
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", gender=" + gender
					+ ", Education=" + Education + ", city=" + city + "]";
		}
}
