# SampleApplication
This is the repo for demonstrating JAVA capabilities. 

Please write a backend infrastracture using the Spring framework and the MVC design pattern to:
- implement a single Rest API call to process customer JSON objects that are formatted as the supplied JSON sample.

- implement the logic for reading/writing from/to a sql database.

- implement the logic to write all the attributes of the json object as a record of a sql table called "user". 
	You can assume a DB name of CommercialUsers

- implementing the logic to send a response back to a client that the db write was successful or had an error.
	NOTE: The response should have enough information to be meaningful, i.e., simply providing a true/false would
	not inform the end user as to "why" a failure happened. If successful, maybe a time stamp or other ID for the record is provided.

- implement the logic to delete a user when receiving a Rest call with a "delete" command and requesting the deletion of a user by their email address.
	Options are:
		ADD,
		DELETE,
		UPDATE.

Please assume that:
- the json object is sent to the cloud in the body of an HTTP POST method
- the sql db is available 

Please design a system that would accomplish the goal. Some of the points have been intentionally made vague to leave the design and implementation decisions to you as the developer.
