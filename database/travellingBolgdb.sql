-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema TravelingBlog
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema TravelingBlog
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TravelingBlog` DEFAULT CHARACTER SET utf8 ;
USE `TravelingBlog` ;

-- -----------------------------------------------------
-- Table `TravelingBlog`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TravelingBlog`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `contactNumber` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `emailId` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TravelingBlog`.`typeOfPlace`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TravelingBlog`.`typeOfPlace` (
  `id` INT NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `userId` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `user_FK_idx` (`userId` ASC) VISIBLE,
  CONSTRAINT `user_FK`
    FOREIGN KEY (`userId`)
    REFERENCES `TravelingBlog`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TravelingBlog`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TravelingBlog`.`city` (
  `id` INT NOT NULL,
  `cityName` VARCHAR(45) NOT NULL,
  `typeOfPlace` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `type_city_fk_idx` (`typeOfPlace` ASC) VISIBLE,
  CONSTRAINT `type_city_fk`
    FOREIGN KEY (`typeOfPlace`)
    REFERENCES `TravelingBlog`.`typeOfPlace` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TravelingBlog`.`travellingExperiance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TravelingBlog`.`travellingExperiance` (
  `id` INT NOT NULL,
  `expirance` VARCHAR(1000) NOT NULL,
  `cityId` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `city_id_fk_idx` (`cityId` ASC) VISIBLE,
  CONSTRAINT `city_id_fk`
    FOREIGN KEY (`cityId`)
    REFERENCES `TravelingBlog`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
