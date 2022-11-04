drop database if exists studio_ghibli;

create database if not exists studio_ghibli;

use studio_ghibli;

create table characters (
	id int not null auto_increment primary key,
	nam varchar(40) not null,
	age varchar(25) not null,
	gender enum("Male","Female") not null,
	hair_color varchar(25)

)engine InnoDB;

create table locations(
	id int not null auto_increment primary key,
    nam varchar(50) not null,
    climate varchar(20) not null,
    terrain varchar(10) not null,
    water_surface int not null
)engine InnoDB;

INSERT INTO `studio_ghibli`.`characters` (`id`, `nam`, `age`, `gender`, `hair_color`) VALUES ('1', 'Haku', '12', 'Male', 'Green');
INSERT INTO `studio_ghibli`.`characters` (`id`, `nam`, `age`, `gender`, `hair_color`) VALUES ('2', 'Pazu', '13', 'Male', 'Brown');
INSERT INTO `studio_ghibli`.`characters` (`id`, `nam`, `age`, `gender`, `hair_color`) VALUES ('3', 'Romska Palo UI Laputa', '33', 'Male', 'Brown');
INSERT INTO `studio_ghibli`.`characters` (`id`, `nam`, `age`, `gender`, `hair_color`) VALUES ('4', 'Okami', '50', 'Female', 'Orange');
INSERT INTO `studio_ghibli`.`characters` (`id`, `nam`, `age`, `gender`, `hair_color`) VALUES ('5', 'San', '17', 'Female', 'Brown');
INSERT INTO `studio_ghibli`.`characters` (`id`, `nam`, `age`, `gender`, `hair_color`) VALUES ('6', 'Eboshi', 'Unspecified', 'Female', 'Black');

INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('1', 'Irontown', 'Continental', 'Mountain', '40');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('2', 'Pazu´s Mines', 'Dry', 'Hill', '0');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('3', 'Koriko', 'Mild', 'Hill', '50');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('4', 'Hospital', 'Continental', 'Hill', '30');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('5', 'The Cat Kingdom', 'Continental', 'Plain', '30');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('6', 'The Marsh House', 'Mild', 'Marsh', '60');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('7', 'Zeniba\'s Cottage', 'TODO', 'TODO', '40');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('8', 'Bamboo Forest', 'Tropical', 'Forest', '10');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('9', 'Laputa', 'Continental', 'City', '40');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('10', 'Karikiyo', 'Mild', 'City', '30');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('11', 'Bathhouse', 'Continental', 'River', '70');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('12', 'Satsuki´s School House', 'Mild', 'River', '60');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('13', 'Fujimoto´s Underwater Harbor', 'Wet', 'Oceano', '100');
INSERT INTO `studio_ghibli`.`locations` (`id`, `nam`, `climate`, `terrain`, `water_surface`) VALUES ('14', 'Himawari Nursery School', 'Mild', 'Ocean', '50');

