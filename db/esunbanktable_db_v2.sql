-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: localhost    Database: esunbanktable
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `emp_id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `floor_seat_seq` bigint DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'132@gmail.com',13,'黃曉明'),(3,'134@gmail.com',6,'黃曉三'),(4,'666@gmail.com',5,'林峻崙'),(6,'111@gmail.com',4,'徐冠文'),(7,'555@mail',3,'胖虎'),(12,'111@gmail.com',NULL,'小夫'),(15,'1@gmail',8,'李1'),(16,'2@gmail',NULL,'李2'),(17,'3@gmail',64,'李3'),(18,'4@gmail',11,'李4'),(19,'5@gmail',30,'李5'),(20,'9@gmail',15,'張1'),(21,'1515@mail',40,'朴敘俊'),(22,'616@gamil.com',31,'洪偉銓'),(23,'8181@gmail',24,'洪2'),(24,'151511@gmail',7,'大熊'),(25,'ss@gmail',1,'大雄'),(26,'999@gmail',NULL,'靜香'),(27,'444@gmail',35,'小新'),(28,'33@gmail.com',10,'廣志'),(29,'44444@gmail',NULL,'阿一'),(30,'1111@gmail',NULL,'阿二'),(31,'1112@gmail',NULL,'阿三'),(32,'wu870410@gmail.com',NULL,'吳冠霖'),(33,'6666@gamil.com',9,'張永義'),(34,'9999@gamil',17,'范郡銘'),(35,'6565@mail',71,'洪偉雄'),(37,'sss@gmail',36,'徐一'),(41,'aaa@gmail',41,'戴姿穎'),(42,'848484@mail',12,'吳冠霖');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seatingchart`
--

DROP TABLE IF EXISTS `seatingchart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seatingchart` (
  `floor_seat_seq` bigint NOT NULL AUTO_INCREMENT,
  `floor_no` int DEFAULT NULL,
  `seat_no` int DEFAULT NULL,
  PRIMARY KEY (`floor_seat_seq`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seatingchart`
--

LOCK TABLES `seatingchart` WRITE;
/*!40000 ALTER TABLE `seatingchart` DISABLE KEYS */;
INSERT INTO `seatingchart` VALUES (3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(10,1,10),(11,2,1),(12,2,2),(13,3,1),(14,4,1),(15,5,1),(16,6,1),(17,7,1),(18,8,1),(19,8,2),(20,8,3),(21,2,3),(22,2,4),(23,2,5),(24,2,6),(25,7,2),(26,7,3),(27,7,4),(28,1,11),(29,1,12),(30,1,13),(31,1,14),(32,1,15),(33,1,16),(34,1,17),(35,1,18),(36,1,19),(37,1,20),(38,1,21),(39,1,22),(40,1,23),(41,1,24),(42,1,25),(43,1,26),(44,1,27),(45,1,28),(46,1,29),(47,1,30),(48,1,31),(49,1,32),(50,2,7),(51,2,8),(52,2,9),(53,2,10),(54,2,11),(55,2,12),(56,2,13),(57,2,14),(58,2,15),(59,2,16),(60,2,17),(61,2,18),(62,2,19),(63,2,20),(64,2,21),(65,2,22),(66,2,23),(67,2,24),(68,2,25),(69,2,26),(70,2,27),(71,3,2),(72,9,1),(73,9,2),(74,9,3),(75,9,4),(76,9,5),(77,9,6),(78,8,4),(79,8,5),(80,8,6),(81,8,7);
/*!40000 ALTER TABLE `seatingchart` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-31 23:18:45
