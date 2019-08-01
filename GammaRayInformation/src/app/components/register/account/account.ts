/*
The account is a small class that defines the properties of a user.
The token property is used to hold the JWT token that is returned
from the api on succesful authentication.
*/

export class Account {
    constructor(
        public firstName: string,
        public lastName: string,
        public username: string,
        public password: string,
        public email: string,
        public token: string
    ){
        /*
            This Model is going to be used to create instances of an account.
         */

    }
}