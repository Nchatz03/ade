-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2018 at 12:37 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `witel ltd`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `ID` int(11) NOT NULL COMMENT 'Category ID',
  `Name` varchar(25) NOT NULL COMMENT 'Category Name',
  `Description` varchar(100) DEFAULT NULL COMMENT 'Category Description',
  `Picture` blob COMMENT 'picture',
  `Status` tinyint(1) NOT NULL COMMENT 'Active =1 or inactive =0 '
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Product Category Table';

-- --------------------------------------------------------

--
-- Table structure for table `metrics`
--

CREATE TABLE `metrics` (
  `Metric` varchar(15) NOT NULL,
  `ID` tinyint(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Metrics Table';

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `IDSKU` bigint(20) NOT NULL COMMENT 'Product Identification number',
  `SKU` varchar(15) DEFAULT NULL COMMENT 'Stock Keeping Unit (or SKU) is a number assigned to a product by a retail store to identify the price, product options and manufacturer of the merchandise.',
  `Title` varchar(25) NOT NULL COMMENT 'Product title ',
  `Description` varchar(100) DEFAULT NULL COMMENT 'Product short description ',
  `SupplierID` int(11) NOT NULL COMMENT 'Suppliers ID',
  `CategoryID` int(11) NOT NULL COMMENT 'Product Category ID',
  `UnitMetric` tinyint(4) NOT NULL COMMENT 'Unit Metric',
  `QuantityPerUnit` int(11) NOT NULL COMMENT 'Quantity of unit in packs(e.x. pack off 100)',
  `UnitPrice` double NOT NULL COMMENT 'Price per Unit',
  `SalePrice` double NOT NULL COMMENT 'Whole Pack Price (QuantityPerUnit *  UnitPrice)',
  `GrossPrice` double NOT NULL COMMENT 'Gross price',
  `NETPrice` double NOT NULL COMMENT 'Shipping Price',
  `Tarrif` double NOT NULL COMMENT 'GrossPrice + NETPrice',
  `Color` varchar(20) DEFAULT NULL COMMENT 'Product color',
  `Size` varchar(50) DEFAULT NULL COMMENT 'Product size',
  `DiscountStatus` tinyint(1) NOT NULL COMMENT 'Is in Discount (yes = 1 no =0 ) ',
  `UnitWeight` double DEFAULT NULL COMMENT 'Unit Weight',
  `UnitsInStock` bigint(20) NOT NULL COMMENT 'Units in stock ',
  `PacksInStock` bigint(20) NOT NULL COMMENT 'Packs per Stock (UnitsinStock/QuantityPerUnit)',
  `UnitsOnOrder` bigint(20) NOT NULL COMMENT 'Units on online orders (allocated units)',
  `PacksOnOrder` bigint(20) NOT NULL COMMENT 'packs on online orders (allocated packs )  (UnitsOnOrder/QuantityPerUnit)',
  `UnitsAvailable` bigint(20) NOT NULL COMMENT 'Units unallocated (ready to sale ) (UnitsInStock - UnitsOnOrder)',
  `PacksAvailable` bigint(20) NOT NULL COMMENT 'Pack ready to sale( UnitsAvailable / QuantityPerUnit)',
  `ProductAvailability` tinyint(1) NOT NULL COMMENT 'Is product Available?',
  `DiscountAvailability` tinyint(1) NOT NULL COMMENT 'Is product on discount?',
  `MarketAvailability` tinyint(1) NOT NULL COMMENT 'Is product Shown on E-commerce',
  `Picture` blob COMMENT 'Product Picture if available',
  `Status` tinyint(1) NOT NULL COMMENT 'Is product Active = 1 or inactive = 0 '
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Table with Products ';

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `ID` int(11) NOT NULL COMMENT 'Shipper ID',
  `CompanyName` varchar(25) NOT NULL COMMENT 'supply company name ',
  `CompanyLogo` blob COMMENT 'company logo',
  `ContactFirstName` varchar(25) DEFAULT NULL COMMENT 'contact name',
  `ContactLastName` varchar(25) DEFAULT NULL COMMENT 'contact surname',
  `ContactTitle` varchar(10) DEFAULT NULL COMMENT 'contact title',
  `Address` varchar(50) NOT NULL COMMENT 'addreess',
  `City` varchar(20) NOT NULL COMMENT 'city',
  `State` varchar(20) NOT NULL COMMENT 'state',
  `PostalCode` varchar(10) NOT NULL COMMENT 'postalcode',
  `Country` varchar(20) NOT NULL COMMENT 'country',
  `Phone` varchar(15) NOT NULL COMMENT 'phone number',
  `Fax` varchar(15) NOT NULL COMMENT 'fax number',
  `Email` varchar(25) NOT NULL COMMENT 'company email',
  `ContactEmail` varchar(25) DEFAULT NULL COMMENT 'contact email',
  `URL` varchar(50) DEFAULT NULL COMMENT 'website url',
  `Notes` varchar(100) DEFAULT NULL COMMENT 'notes',
  `Status` tinyint(1) NOT NULL COMMENT 'Active (1) or inactive (0)'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Suppliers table';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `metrics`
--
ALTER TABLE `metrics`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`IDSKU`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Category ID';

--
-- AUTO_INCREMENT for table `metrics`
--
ALTER TABLE `metrics`
  MODIFY `ID` tinyint(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `IDSKU` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'Product Identification number';

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Shipper ID';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
