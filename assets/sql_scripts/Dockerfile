#Postgres Database Setup
FROM postgres 

#Setting DB ENV variable on startup
ENV POSTGRES_USER supreeth 
ENV POSTGRES_DB bt
ENV POSTGRES_HOST_AUTH_METHOD trust

#Sql to run on startup
COPY ./createTablesAndViews.sql /docker-entrypoint-initdb.d/

#Expose port 5432
EXPOSE 5432