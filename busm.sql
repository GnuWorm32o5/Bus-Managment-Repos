-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2023 at 08:08 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `busm`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(1) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `bus_details`
--

CREATE TABLE `bus_details` (
  `id` int(100) NOT NULL,
  `bus_no` varchar(100) NOT NULL,
  `bus_source` varchar(100) NOT NULL,
  `bus_dest` varchar(100) NOT NULL,
  `szDate` date NOT NULL,
  `Price` varchar(10000) NOT NULL,
  `departTime` varchar(100) NOT NULL,
  `seat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `bus_details`
--

INSERT INTO `bus_details` (`id`, `bus_no`, `bus_source`, `bus_dest`, `szDate`, `Price`, `departTime`, `seat`) VALUES
(3, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '06:30', '50'),
(4, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Radni Dan', '07:00', '50'),
(5, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Ponedeljkom', '07:30', '50'),
(6, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Subota', '07:45', '50'),
(7, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '08:45', '50'),
(8, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Skolski', '09:45', '50'),
(9, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Skolski', '10:30', '50'),
(10, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '10:45', '50'),
(11, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Sub + Ned', '12:15', '50'),
(12, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Radni Dan', '12:45', '50'),
(13, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Radni Dan', '13:30', '50'),
(14, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Radni Dan', '14:30', '50'),
(15, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan + Sk', '15:00', '50'),
(16, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '17:00', '50'),
(17, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '17:30', '50'),
(18, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '18:45', '50'),
(19, 'NS 135 50', 'Becej', 'Novi Sad', '2019-02-01', 'Svaki Dan', '19:45', '50'),
(20, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '06:00', '50'),
(21, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '06:45', '50'),
(22, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '08:45', '50'),
(23, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '09:45', '50'),
(24, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Skolski', '10:45', '50'),
(25, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '11:00', '50'),
(26, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '12:15', '50'),
(27, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '13:15', '50'),
(28, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '13:45', '50'),
(29, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan + S', '14:15', '50'),
(30, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '14:45', '50'),
(31, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '15:15', '50'),
(32, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Radni Dan', '15:45', '50'),
(33, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '16:15', '50'),
(34, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Skolski polazak', '17:00', '50'),
(35, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '18:00', '50'),
(36, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Skolski', '18:45', '50'),
(37, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '19:30', '50'),
(38, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Skolski ', '20:15', '50'),
(39, '135 50', 'Novi Sad', 'Becej', '2019-02-01', 'Svaki Dan', '21:00', '50'),
(40, '136 50', 'Becej', 'Beograd', '2019-02-01', 'Svaki Dan', '06:00', '50'),
(41, '136 50', 'Becej', 'Beograd', '2019-02-01', 'Svaki Dan', '06:45', '50'),
(42, '136 50', 'Becej', 'Beograd', '2019-02-01', 'Svaki Dan', '10:45', '50'),
(43, '136 50', 'Becej', 'Beograd', '2019-02-01', 'Svaki Dan', '15:00', '50'),
(44, '136 50', 'Beograd', 'Becej', '2019-02-01', 'Svaki Dan', '09:30', '50'),
(45, '136 50', 'Beograd', 'Becej', '2019-02-01', 'Svaki Dan', '12:30', '50'),
(46, '136 50', 'Beograd', 'Becej', '2019-02-01', 'Svaki Dan', '14:30', '50'),
(47, '136 50', 'Beograd', 'Becej', '2019-02-01', 'Svaki Dan', '17:45', '50'),
(48, '136 50', 'Becej', 'Temerin', '2019-02-01', 'Svaki Dan', '06:30', '50'),
(49, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Svaki Dan', '06:45', '50'),
(50, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Radni Dan + S', '07:30', '50'),
(51, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Svaki Dan', '08:45', '50'),
(52, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Skolski', '10:30', '50'),
(53, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Skolski', '12:00', '50'),
(54, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Subota + Ned', '12:15', '50'),
(55, '138 50', 'Becej', 'Temerin', '2019-02-01', 'Radni Dan', '12:45', '50'),
(56, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Radni Dan', '13:30', '50'),
(57, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Radni Dan', '14:30', '50'),
(58, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Skolski', '15:00', '50'),
(59, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Svaki Dan', '17:00', '50'),
(60, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Svaki Dan', '18:45', '50'),
(61, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Skolski', '19:30', '50'),
(62, '137 50', 'Becej', 'Temerin', '2019-02-01', 'Svaki Dan', '19:45', '50'),
(63, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Radni Dan', '06:30', '50'),
(64, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Skolski', '06:45', '50'),
(65, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Radni Dan + S', '07:15', '50'),
(66, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Radni Dan', '09:15', '50'),
(67, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '10:15', '50'),
(68, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Skolski', '11:30', '50'),
(69, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '11:45', '50'),
(70, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '12:30', '50'),
(71, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Skolski', '12:45', '50'),
(72, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Radni Dan', '13:45', '50'),
(73, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Radni Dan + S', '14:15', '50'),
(74, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '15:45', '50'),
(75, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '16:45', '50'),
(76, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Skolski', '17:30', '50'),
(77, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '18:30', '50'),
(78, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Skolski', '19:15', '50'),
(79, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '19:45', '50'),
(80, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Skolski', '20:30', '50'),
(81, '137 50', 'Temerin', 'Becej', '2019-02-01', 'Svaki Dan', '21:00', '50'),
(82, '140 50', 'Becej', 'Subotica', '2019-02-01', 'Radni Dan + S', '06:00', '50'),
(83, '140 50', 'Becej', 'Subotica', '2019-02-01', 'Radni Dan + S', '07:00', '50'),
(84, '140 50', 'Becej', 'Subotica', '2019-02-01', 'Nedelja', '16:00', '50'),
(85, '145 50', 'Subotica', 'Becej', '2019-02-01', 'Radni Dan + S', '11:00', '50'),
(86, '145 50', 'Subotica', 'Becej', '2019-02-01', 'Radni Dan + S', '14:00', '50'),
(87, '145 50', 'Subotica', 'Becej', '2019-02-01', 'Nedelja', '18:00', '50');

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE `employee_details` (
  `id` int(100) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `phoneno1` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`id`, `firstname`, `lastname`, `phoneno1`) VALUES
(9, 'Marko', 'Mandic', ''),
(10, 'Stevan', 'Glavaski', ''),
(11, 'Stefanija', 'Bugarski', ''),
(12, 'Vanja', 'Mandic', ''),
(13, 'Dragan', 'Arlov', ''),
(14, 'Danilo', 'Mihajlovic', ''),
(15, 'Predrag', 'Djurkovic', ''),
(16, 'Strahinja', 'Peric', ''),
(17, 'Uros', 'Dumanovic', ''),
(18, 'Radovan', 'Dumanovic', '');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `id` int(100) NOT NULL,
  `bus_source` varchar(100) NOT NULL,
  `bus_dest` varchar(100) NOT NULL,
  `combo` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `Mesta` varchar(100) NOT NULL,
  `b` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`id`, `bus_source`, `bus_dest`, `combo`, `date`, `Mesta`, `b`) VALUES
(1, 'Subotica', 'Becej', '18:00', '2019-02-01', '1', '24200935');

-- --------------------------------------------------------

--
-- Table structure for table `ticket_no`
--

CREATE TABLE `ticket_no` (
  `id` int(100) NOT NULL,
  `ticket_no` varchar(10000) NOT NULL,
  `price` varchar(10000) NOT NULL,
  `bus_source` varchar(1000) NOT NULL,
  `bus_dest` varchar(1000) NOT NULL,
  `Date` date NOT NULL,
  `Time` varchar(1000) NOT NULL,
  `Mesta` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `ticket_no`
--

INSERT INTO `ticket_no` (`id`, `ticket_no`, `price`, `bus_source`, `bus_dest`, `Date`, `Time`, `Mesta`) VALUES
(1, '24200935', '1300,00 rsd', 'Subotica', 'Becej', '2019-02-01', '1300,00 rsd', '1');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `id` int(10) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`id`, `firstname`, `lastname`, `username`, `password`, `email`) VALUES
(1, 'admin', 'admin', 'admin', 'admin', 'admin'),
(2, 'Stevan', 'Glavaski', 'korisnik', 'korisnik', 'korisnik'),
(3, 'Dragan', 'Arlov', 'dr30', 'dr30', 'asdasd'),
(4, 'stiv', 'stiv', 'stiv', 'stiv', 'stiv');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bus_details`
--
ALTER TABLE `bus_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee_details`
--
ALTER TABLE `employee_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ticket_no`
--
ALTER TABLE `ticket_no`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `bus_details`
--
ALTER TABLE `bus_details`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT for table `employee_details`
--
ALTER TABLE `employee_details`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `ticket_no`
--
ALTER TABLE `ticket_no`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user_details`
--
ALTER TABLE `user_details`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
