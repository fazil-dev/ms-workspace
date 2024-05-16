--Grant User permissions for app-user
GRANT Create tablespace ON *.* TO 'app-user'@'%';
GRANT Alter ON `order-service`.* TO 'app-user'@'%';
GRANT Create ON `order-service`.* TO 'app-user'@'%';
GRANT Create view ON `order-service`.* TO 'app-user'@'%';
GRANT Delete ON `order-service`.* TO 'app-user'@'%';
GRANT Drop ON `order-service`.* TO 'app-user'@'%' WITH GRANT OPTION;
GRANT Index ON `order-service`.* TO 'app-user'@'%';
GRANT Insert ON `order-service`.* TO 'app-user'@'%';
GRANT References ON `order-service`.* TO 'app-user'@'%';
GRANT Select ON `order-service`.* TO 'app-user'@'%';
GRANT Show view ON `order-service`.* TO 'app-user'@'%';
GRANT Trigger ON `order-service`.* TO 'app-user'@'%';
GRANT Update ON `order-service`.* TO 'app-user'@'%';
GRANT Alter routine ON `order-service`.* TO 'app-user'@'%';
GRANT Create routine ON `order-service`.* TO 'app-user'@'%';
GRANT Create temporary tables ON `order-service`.* TO 'app-user'@'%';
GRANT Execute ON `order-service`.* TO 'app-user'@'%';
GRANT Lock tables ON `order-service`.* TO 'app-user'@'%';
GRANT Grant option ON `order-service`.* TO 'app-user'@'%';


