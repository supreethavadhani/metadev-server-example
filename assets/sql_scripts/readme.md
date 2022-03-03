# The Steps to setup PSQL on your laptop

- First install PSQL SERVER: Follow instructions in link below(for both mac and windows): 
    -   https://www.postgresql.org/download/
- Connect to psql via CLI or a clients such as PG ADMIN 
- Run createTablesAndViews.sql file 
- above file not only creates tables and view, it also adds master data for most.
- student related data is in csv folder. import the files in the csv folder to teh corresponding tables
- now the db is ready to do transactions. 

#Order of transactions
- offer subject
- assign staff (optional)
- assign test types (test scheems)
- marks entry
- attendance entry
- mark eligibility(menu item is missing)
- eligibility/condone attendance
- hall-ticket

** THE END **
