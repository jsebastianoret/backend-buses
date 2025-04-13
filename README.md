create database retoTecnico;

CREATE TABLE marca_bus (
    idMarcaBus INT AUTO_INCREMENT PRIMARY KEY,
    nombreMarca VARCHAR(100) NOT NULL
);

CREATE TABLE bus (
    idBus INT AUTO_INCREMENT PRIMARY KEY,
    numeroBus VARCHAR(20) NOT NULL,
    placa VARCHAR(20) NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    caracteristicas TEXT,
    activo BOOLEAN DEFAULT TRUE,
    marca_id INT,
    FOREIGN KEY (marca_id) REFERENCES marca_bus(idMarcaBus)
);

INSERT INTO marca_bus (nombreMarca)
VALUES ('Scania'),('Fiat'),('Nissan');

INSERT INTO bus (numeroBus, placa, caracteristicas, marca_id)
VALUES ('103', 'QWF165', 'Bus, 52 asientos', 2);
