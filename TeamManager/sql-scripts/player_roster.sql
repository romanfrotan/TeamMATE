CREATE DATABASE  IF NOT EXISTS `player_roster`;
USE `player_roster`;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;

CREATE TABLE `player` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
`position` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `player`
--

INSERT INTO `player` VALUES
	(1,'Leslie','Andrews','leslie@soccerzone.com','forward'),
	(2,'Emma','Baumgarten','emma@soccerzone.com','forward'),
	(3,'Avani','Gupta','avani@soccerzone.com','defender'),
	(4,'Yuri','Petrov','yuri@soccerzone.com','goalkeeper'),
	(5,'Juan','Vega','soccerzone.com','midfeilder');

