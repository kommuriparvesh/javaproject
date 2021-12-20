-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2021-12-18 05:12:33.665

-- tables
-- Table: Categories
CREATE TABLE Categories (
    categoryId int  NOT NULL,
    sourceUrl varchar(30)  NOT NULL,
    value int  NOT NULL,
    quantity int  NOT NULL,
    dateSeen datetime  NOT NULL,
    ElectroniData_asins varchar(20)  NOT NULL,
    CONSTRAINT Categories_pk PRIMARY KEY  (categoryId)
);

-- Table: ElectroniData
CREATE TABLE ElectroniData (
    asins varchar(20)  NOT NULL,
    brand varchar(20)  NOT NULL,
    categories varchar(20)  NOT NULL,
    colors varchar(20)  NOT NULL,
    dimesions int  NOT NULL,
    ean int  NOT NULL,
    features varchar(50)  NOT NULL,
    CONSTRAINT ElectroniData_pk PRIMARY KEY  (asins)
);

-- foreign keys
-- Reference: Categories_ElectroniData (table: Categories)
ALTER TABLE Categories ADD CONSTRAINT Categories_ElectroniData
    FOREIGN KEY (ElectroniData_asins)
    REFERENCES ElectroniData (asins);

-- End of file.

select * from ElectroniData

insert into ElectroniData(asins,brand,categories,colors,dimesions,ean,features) 
values('AEfshys1626','IPHONE','Mobile','White',15,12345,'Iphone12new camera')

insert into ElectroniData(asins,brand,categories,colors,dimesions,ean,features) 
values('DUDKJE82928sas','OnePlus','Mobile','Black',85,44656,'One Plus newgenOS')



update ElectroniData set categories = 'Television' where ean = 44656


delete Categories



select a.asins,b.categoryId from ElectroniData a, Categories b
where a.categories = b.categoryId




CREATE INDEX electronic
ON ElectroniData (asins);





CREATE VIEW electronicview AS SELECT brand, colors
FROM ElectroniData
WHERE dimesions = '85';

select * from electronicview

CREATE TRIGGER electrics BEFORE INSERT ON categories
       FOR EACH ROW SET @sum = @sum + NEW.id




SET IMPLICIT_TRANSACTIONS ON 
UPDATE 
    ElectroniData 
SET 
    brand = 'IPHONE12'
WHERE 
    ean = 12345 
SELECT 
    IIF(@@OPTIONS & 2 = 2, 
    'Implicit Transaction Mode ON', 
    'Implicit Transaction Mode OFF'
    ) AS 'Transaction Mode' 
SELECT 
    @@TRANCOUNT AS OpenTransactions 
COMMIT TRAN 
SELECT 
    @@TRANCOUNT AS OpenTransactions



grant insert, 
select on ElectroniData to Hamil





BEGIN TRAN  
UPDATE ElectroniData SET   Brand='Redmi' where ean = 12345  
SELECT @@SPID AS session_id   


SELECT * FROM sys.dm_tran_locks  WHERE request_session_id=52 

SELECT dm_tran_locks.request_session_id,  
       dm_tran_locks.resource_database_id,  
       DB_NAME(dm_tran_locks.resource_database_id) AS master,  
       CASE  
           WHEN resource_type = 'OBJECT'  
               THEN OBJECT_NAME(dm_tran_locks.resource_associated_entity_id)  
           ELSE OBJECT_NAME(partitions.OBJECT_ID)  
       END AS ObjectName,  
       partitions.index_id,  
       indexes.name AS index_name,  
       dm_tran_locks.resource_type,  
       dm_tran_locks.resource_description,  
       dm_tran_locks.resource_associated_entity_id,  
       dm_tran_locks.request_mode,  
       dm_tran_locks.request_status  
FROM sys.dm_tran_locks  
LEFT JOIN sys.partitions ON partitions.hobt_id = dm_tran_locks.resource_associated_entity_id  
LEFT JOIN sys.indexes ON indexes.OBJECT_ID = partitions.OBJECT_ID AND indexes.index_id = partitions.index_id  
WHERE resource_associated_entity_id > 0  
  AND resource_database_id = DB_ID()  
 and request_session_id=52  
ORDER BY request_session_id, resource_associated_entity_id 










Backup database master to disk = 'D:\MasterDB_Bkp.bak'