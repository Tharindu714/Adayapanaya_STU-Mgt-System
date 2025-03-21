-- MySQL Workbench Synchronization
-- Generated: 2023-07-02 09:34
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Tharindu

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

ALTER SCHEMA `adyapana_db`  DEFAULT CHARACTER SET utf8  DEFAULT COLLATE utf8_general_ci ;

ALTER TABLE `adyapana_db`.`class` 
DROP FOREIGN KEY `fk_teacher_has_subjects_subjects1`;

ALTER TABLE `adyapana_db`.`invoice` 
DROP FOREIGN KEY `fk_student_has_teacher_student1`,
DROP FOREIGN KEY `fk_student_has_teacher_subjects1`;

ALTER TABLE `adyapana_db`.`student` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ;

ALTER TABLE `adyapana_db`.`teacher` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ;

ALTER TABLE `adyapana_db`.`subjects` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ;

ALTER TABLE `adyapana_db`.`class` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ;

ALTER TABLE `adyapana_db`.`invoice` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ;

CREATE TABLE IF NOT EXISTS `adyapana_db`.`Admin` (
  `Email` VARCHAR(100) NOT NULL,
  `Name` VARCHAR(50) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Email`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

ALTER TABLE `adyapana_db`.`class` 
DROP FOREIGN KEY `fk_teacher_has_subjects_teacher`;

ALTER TABLE `adyapana_db`.`class` ADD CONSTRAINT `fk_teacher_has_subjects_teacher`
  FOREIGN KEY (`t_no`)
  REFERENCES `adyapana_db`.`teacher` (`t_no`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_teacher_has_subjects_subjects1`
  FOREIGN KEY (`sub_no`)
  REFERENCES `adyapana_db`.`subjects` (`sub_no`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `adyapana_db`.`invoice` 
DROP FOREIGN KEY `fk_student_has_teacher_teacher1`;

ALTER TABLE `adyapana_db`.`invoice` ADD CONSTRAINT `fk_student_has_teacher_student1`
  FOREIGN KEY (`s_no`)
  REFERENCES `adyapana_db`.`student` (`s_no`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_student_has_teacher_teacher1`
  FOREIGN KEY (`t_no`)
  REFERENCES `adyapana_db`.`teacher` (`t_no`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_student_has_teacher_subjects1`
  FOREIGN KEY (`sub_no`)
  REFERENCES `adyapana_db`.`subjects` (`sub_no`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
