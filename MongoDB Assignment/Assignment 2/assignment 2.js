// MongoDB - Aggregation Exercises
// Import the zips.json file into your MongoDB. Database name is "population" and collection name is "zipcodes".
use("Population");
// ============================================================================================================
// Atlanta Population
// db.zipcodes.find();
// 1. use db.zipcodes.find() to filter results to only the results where city is ATLANTA and state is GA.
// db.zipcodes.find({$and:[{city:"ATLANTA"},{state:"GA"}]});
// 2. use db.zipcodes.aggregate with $match to do the same as above.
// db.zipcodes.aggregate({$match:{city:"ATLANTA"}},{$match:{state:"GA"}});
// 3. use $group to count the number of zip codes in Atlanta.
// db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$city",num:{$sum:1}}}]);
// 4. use $group to find the total population in Atlanta.
// db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$city",num:{$sum:"$pop"}}}]);
// ================================================================================================================
// Populations By State
// 1. use aggregate to calculate the total population for each state
// db.zipcodes.aggregate([{$group:{_id:"$state",num:{$sum:"$pop"}}}]);
// 2. sort the results by population, highest first
// db.zipcodes.aggregate([{$group:{_id:"$state",num:{$sum:"$pop"}}},{$sort:{num:-1}}]);
// 3. limit the results to just the first 3 results. What are the top 3 states in population?
// db.zipcodes.aggregate([{$group:{_id:"$state",num:{$sum:"$pop"}}},{$sort:{num:-1}},{$limit:3}]);
// ===================================================================================================================
// Populations by City
// 1. use aggregate to calculate the total population for each city (you have to use city/state combination). You can use a combination for the _id of the $group: { city: '$city', state: '$state' }
// db.zipcodes.aggregate([{$group:{_id:{ city: '$city', state: '$state' },num:{$sum:"$pop"}}}]);
// 2. sort the results by population, highest first
// db.zipcodes.aggregate([{$group:{_id:{ city: '$city', state: '$state' },num:{$sum:"$pop"}}},{$sort:{num:-1}}]);
// 3. limit the results to just the first 3 results. What are the top 3 cities in population?
// db.zipcodes.aggregate([{$group:{_id:{ city: '$city', state: '$state' },num:{$sum:"$pop"}}},{$sort:{num:-1}},{$limit:3}]);
// 4. What are the top 3 cities in population in Texas?
// db.zipcodes.aggregate([{$match:{state:"TX"}},{$group:{_id:{ city: '$city', state: '$state' },num:{$sum:"$pop"}}},{$sort:{num:-1}},{$limit:3}]);
// ========================================================================================================================
// Bonus
// 1. Write a query to get the average city population for each state.
// db.zipcodes.aggregate([{$group:{_id: '$state' , avgPop:{$avg:"$pop"}}}]);
// 2. What are the top 3 states in terms of average city population?
// db.zipcodes.aggregate([{$group:{_id: '$state' , avgPop:{$avg:"$pop"}}},{$sort:{avgPop:-1}},{$limit:3}]);