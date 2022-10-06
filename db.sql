CREATE DATABASE `contacts` DEFAULT CHARACTER SET utf8mb4;
USE `contacts`;

CREATE TABLE `user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `status` TINYINT NOT NULL,
  `create_date` DATETIME NOT NULL,
  `update_date` DATETIME NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `unique_email` (`email`)
) ENGINE=InnoDB;

CREATE TABLE `contact` (
  `contact_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `first_name` VARCHAR(30) NOT NULL,
  `last_name` VARCHAR(30) NULL,
  `nick_name` VARCHAR(30) NULL,
  `dob` DATE NULL,
  `address` VARCHAR(200) NULL,
  `city` VARCHAR(50) NULL,
  `state` VARCHAR(50) NULL,
  `country` VARCHAR(50) NULL,
  `zip_code` VARCHAR(8) NULL,
  `status` TINYINT NOT NULL,
  `create_date` DATETIME NOT NULL,
  `update_date` DATETIME NOT NULL,
  PRIMARY KEY (`contact_id`),
  CONSTRAINT `fk_contact_ref_user_by_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB;

CREATE TABLE `contact_email` (
  `contact_id` INT NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`contact_id`,`email`),
  CONSTRAINT `fk_contact_email_ref_contact_by_contact_id` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`contact_id`)
) ENGINE=InnoDB;

CREATE TABLE `contact_phone` (
  `contact_id` INT NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`contact_id`,`phone`),
  CONSTRAINT `fk_contact_phone_ref_contact_by_contact_id` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`contact_id`)
) ENGINE=InnoDB;

CREATE USER `contacts`@`localhost` IDENTIFIED BY 'contacts';
GRANT ALL ON `contacts`.* TO `contacts`@`localhost`;

