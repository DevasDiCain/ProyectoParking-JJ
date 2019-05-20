-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: 192.168.56.102    Database: Aparka
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Abonado`
--

DROP TABLE IF EXISTS `Abonado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Abonado` (
  `codabonado` int(11) NOT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `abono` varchar(60) DEFAULT NULL,
  `feciniabo` date DEFAULT NULL,
  `fecfinabo` date DEFAULT NULL,
  `fecnacimiento` date DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `numTarjeta` varchar(60) DEFAULT NULL,
  `matricula` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codabonado`),
  KEY `fk_Abonado_Vehiculo` (`matricula`),
  CONSTRAINT `fk_Abonado_Vehiculo` FOREIGN KEY (`matricula`) REFERENCES `Vehiculo` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Abonado`
--

LOCK TABLES `Abonado` WRITE;
/*!40000 ALTER TABLE `Abonado` DISABLE KEYS */;
INSERT INTO `Abonado` VALUES (1,'Hugo Weston','MENSUAL','1995-03-11','2010-02-28','1997-06-05','12','12','012',NULL),(2,'Hugo Weston','MENSUAL','1995-03-11','2010-02-28','1997-06-05','12','12','012',NULL),(3,'Hugo Weston','MENSUAL','1995-03-11','2010-02-28','1997-06-05','12','12','012',NULL),(4,'Hugo Weston','MENSUAL','1995-03-11','2010-02-28','1997-06-05','12','12','012',NULL),(5,'Hugo Weston','MENSUAL','1995-03-11','2010-02-28','1997-06-05','12','12','012',NULL),(6,'Pepe','MENSUAL','1995-03-11','2010-02-28','1997-06-05','12','12','012',NULL);
/*!40000 ALTER TABLE `Abonado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-20 10:58:40
