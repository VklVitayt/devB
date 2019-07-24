-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bank_list
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bank_list
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bank_list` DEFAULT CHARACTER SET utf8 ;
USE `bank_list` ;

-- -----------------------------------------------------
-- Table `bank_list`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bank_list`.`account` (
  `accountid` INT(11) NOT NULL,
  `account` INT(11) NOT NULL,
  `userid` INT(11) NOT NULL,
  PRIMARY KEY (`accountid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bank_list`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bank_list`.`user` (
  `userid` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `sureName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
