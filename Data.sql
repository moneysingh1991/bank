-- MySQL dump 10.13  Distrib 5.6.24, for osx10.8 (x86_64)
--
-- Host: 127.0.0.1    Database: Bank
-- ------------------------------------------------------
-- Server version	5.6.27

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
-- Table structure for table `Account`
--

DROP TABLE IF EXISTS `Account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Account` (
  `SocialSecurity` varchar(11) NOT NULL DEFAULT '0',
  `AccountNumber` varchar(20) NOT NULL,
  `Balance` int(10) DEFAULT '0',
  PRIMARY KEY (`SocialSecurity`,`AccountNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Account`
--

LOCK TABLES `Account` WRITE;
/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
INSERT INTO `Account` VALUES ('10','100010',8500),('12','100029',0),('2','100002',31500),('234-34-3456','100031',0),('3','100003',15000),('4','100005',8000),('5','100005',7000),('6','100006',2000),('7','100007',5600),('8','100008',9000),('9','100009',6000);
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Client`
--

DROP TABLE IF EXISTS `Client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Client` (
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(25) DEFAULT NULL,
  `SocialSecurity` varchar(11) NOT NULL,
  `Dob` varchar(10) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `PhoneNumber` varchar(12) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SocialSecurity`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Client`
--

LOCK TABLES `Client` WRITE;
/*!40000 ALTER TABLE `Client` DISABLE KEYS */;
INSERT INTO `Client` VALUES ('','','','','','',''),('fern','hem','10','3/9/1972','23 verna st, fairfield, ca','789-908-7856','hern@gmail.com'),('jack','fery','12','3/5/1967','123 vermont st, sf','543-768-890','fery@gmail.com'),('Rajan','kumar','2','10/02/1991','23400 lak merrit, oakland,ca','415-678-4532','rajan@gmail.com'),('remy','seh','234-34-3456','3/4/1978','23 vern st ','657-890-7896','remy@gmail.com'),('frank','underwwod','3','2/3/1978','345 baljim st , oakland, ca','678-987-0076','frank@gmail.com'),('Money','singh','4','12/7/1967','234 ged st , oakland, ca','456-876-0008','cen@gmail.com'),('james','wood','5','4/8/1978','23 gerry st , san fra, ca','678-987-5674','james@gmail.com'),('William','cen','6','11/4/1986','234 bergan st, luis,ca','567-864-9078',NULL),('William','jain','7','11/4/1986','234 bergan st, sacramento,ca','567-864-9071','jain@gmail.com'),('John','meg','8','1/7/1967','1456 belgin st , pal alto , ca','510-678-0074','meg@gmail.com'),('berky','den','9','6/8/1956','90 jemin st, valleyo, ca','678-456-0987','den@gmail.com');
/*!40000 ALTER TABLE `Client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workers`
--

DROP TABLE IF EXISTS `workers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workers` (
  `userid` varchar(25) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workers`
--

LOCK TABLES `workers` WRITE;
/*!40000 ALTER TABLE `workers` DISABLE KEYS */;
INSERT INTO `workers` VALUES ('alpha','22222'),('bita',''),('money','12345'),('tango','1001');
/*!40000 ALTER TABLE `workers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-08  8:21:14
