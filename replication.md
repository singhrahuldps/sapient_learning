# Steps to use Replica Sets in MongoDB

We will use a primary server and a single secondary server configuration.

1. Shutdown all running instances of mongoDB on your computer. Run the following command using Command Prompt with administrative priviliges
```
net stop MongoDB
```

2. Deploy a standalone replica set with name rs0
```
mongod --port 27017 --replSet rs0 --dbpath E:\Tools\MongoDB\Server\4.2\data\rset
```

3. Deploy another mongoDB server which would act as secondary to the original server
```
mongod --port 27018 --replSet rs0 --dbpath E:\Tools\MongoDB\Server\4.2\data\rset1
```

4. Start the mongoDB shell
```
mongo --port 27017
```

5. Initiate the replica set
```
rs.initiate()
```

6. Check the status of your replica sets and verify everything is working fine
```
rs.status()
```

7. Create a database and add some data to it
```
use class
db.students.insertOne({name: "Rahul Singh", age: 22})
db.students.insertOne({name: "John Doe", age: 12})
```

8. Exit that server and enter the secondary server
```
exit
mongo --port 27018
```

9. Enable to read from the secondary server
```
rs.slaveOk()
```

10. From the secondary server, read the data added in the primary server
```
use class
db.students.find()
```