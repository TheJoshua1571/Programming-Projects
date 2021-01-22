CREATE DATABASE `company` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `employees` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `salary` decimal(8,2) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `supervisor_id` int DEFAULT NULL,
  `bonus` bit(1) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `insurance` int DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
