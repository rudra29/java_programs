var pizza={
	toppings: ['cheese','sauce','pepperoni'],
	crust: 'deep dish',
	serves:2
}

for(var i=0;i<pizza.toppings.length;i++)
{
	console.log(pizza.toppings[i]);
}
console.log(pizza.crust+" \n "+pizza.serves);