-- MySQL Script generated by MySQL Workbench
-- Fri Apr  8 23:31:03 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema neptis
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema neptis
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `neptis` DEFAULT CHARACTER SET utf8 ;
USE `neptis` ;

-- -----------------------------------------------------
-- Table `neptis`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `neptis`.`users` (
                                                `id` INT NOT NULL AUTO_INCREMENT,
                                                `nick` VARCHAR(45) NOT NULL,
                                                `login` VARCHAR(45) NOT NULL,
                                                `password` VARCHAR(45) NOT NULL,
                                                `insert_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                                PRIMARY KEY (`id`))
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `neptis`.`vehicles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `neptis`.`vehicles` (
                                                   `id` INT NOT NULL,
                                                   `brand` VARCHAR(45) NOT NULL,
                                                   `model` VARCHAR(45) NOT NULL,
                                                   `users_id` INT NOT NULL,
                                                   `insert_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                                   PRIMARY KEY (`id`),
                                                   INDEX `fk_vehicles_users_idx` (`users_id` ASC) VISIBLE,
                                                   CONSTRAINT `fk_vehicles_users`
                                                       FOREIGN KEY (`users_id`)
                                                           REFERENCES `neptis`.`users` (`id`)
                                                           ON DELETE NO ACTION
                                                           ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `neptis`.`insurance_offers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `neptis`.`insurance_offers` (
                                                           `id` INT NOT NULL AUTO_INCREMENT,
                                                           `insurer` VARCHAR(45) NOT NULL,
                                                           `price` FLOAT NOT NULL,
                                                           `vehicles_id` INT NOT NULL,
                                                           `insert_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                                           PRIMARY KEY (`id`),
                                                           INDEX `fk_table3_vehicles1_idx` (`vehicles_id` ASC) VISIBLE,
                                                           CONSTRAINT `fk_table3_vehicles1`
                                                               FOREIGN KEY (`vehicles_id`)
                                                                   REFERENCES `neptis`.`vehicles` (`id`)
                                                                   ON DELETE NO ACTION
                                                                   ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO users (nick, login, password) VALUES ('nick1','login1','password1');
INSERT INTO users (nick, login, password) VALUES ('nick2','login2','password2');
INSERT INTO  insurance_offers (insurer, price, vehicles_id) VALUES ('insurer1',25.05,1);
INSERT INTO vehicles (brand, model, users_id) VALUES ('brand1','model1',1);











