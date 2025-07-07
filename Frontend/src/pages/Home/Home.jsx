import React from 'react'

const Home = () => {
  return (
    <div className='hero h-screen  text-center py-20 mt-20 bg-black'>
        <h1 className='text-5xl text-white font-bold'>Welcome to Blogify</h1>
         <p className='mt-4 text-white text-xl'>Create,Share,and Explore content across a range of categories</p>
          <div className='mt-3'>
            {/* <button className='bg-blue-600 text-white px-3 py-2 rounded-lg hover:bg-blue-700 dark:bg-gray-800 dark:text-white  '>Get Started</button> */}
            <button type="button" className="text-gray-900  bg-white borderfocus:outline-none hover:bg-gray-100 focus:ring-4 focus:ring-gray-100 font-medium rounded-lg text-lg px-5 py-2.5 me-2 mb-2  dark:text-black dark:border-gray-600 dark:hover:bg-cyan-50 dark:hover:border-gray-600 dark:focus:ring-gray-700">Get Started</button>
          </div>
          <br />
         <div className='flex items-center justify-center categories'>
            <div className='flex items-center me-4'>
               <button type="button" className="text-white bg-gray-800 hover:bg-gray-900 focus:outline-none focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-700 dark:border-gray-700">ALL</button>
            </div>
            <div className='flex items-center me-4'>
            <button type="button" className="text-white bg-gray-800 hover:bg-gray-900 focus:outline-none focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-700 dark:border-gray-700">TECHNOLOGIES</button>
           </div>

           <div className='flex items-center me-4'>
             <button type="button" className="text-white bg-gray-800 hover:bg-gray-900 focus:outline-none focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-700 dark:border-gray-700">INFORMATIQUIES</button>
           </div>

           <div className='flex items-center me-4'>

            <button type="button" className="text-white bg-gray-800 hover:bg-gray-900 focus:outline-none focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-700 dark:border-gray-700">RESTAURANT</button>
           </div>

           <div className='flex items-center me-4'>
              <button type="button" className="text-white bg-gray-800 hover:bg-gray-900 focus:outline-none focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-700 dark:border-gray-700">JOB</button>
           </div>
           <div className='flex items-center me-4'>
               <button type="button" className="text-white bg-gray-800 hover:bg-gray-900 focus:outline-none focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-700 dark:border-gray-700">CUISINE</button>
           </div>
         </div>

    </div>
  )
}

export default Home
